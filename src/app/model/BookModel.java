package app.model;


import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import app.database.Database;
import app.entity.AuthorEntity;
import app.entity.BookEntity;
import app.entity.Entity;

public class BookModel extends Model {

	public BookModel(Database db) {
		super(db);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * liste l'ensemble des books existants si la barre de recherche est vide
	 * @return ArrayList de Book 
	 */
	public ArrayList<BookEntity> lister(){
		ArrayList<BookEntity> list = new ArrayList();
		try {
			Statement statement = db.getConnection().createStatement();	
			
			String req = "Select * from BOOK ;";
			
			ResultSet res = statement.executeQuery(req);
			
			while (res.next()) {
				list.add(new BookEntity(res.getInt("ID"), res.getInt("ID_AUTHOR"), res.getInt("ID_CATEGORY"), res.getString("RESUME"),		
				res.getString("ISBN"), res.getString("TITLE"), res.getInt("NBPAGES") ) );
			} 
					
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		
		return list;
	}
	
	/**
	 * retourne le ou les livres comprenant la saisie de l'utilisateur
	 * @param saisie
	 * @return ArrayList de Book
	 */
	
	public ArrayList<BookEntity> search(String saisie) {
		ArrayList<BookEntity> liste = new ArrayList<BookEntity>();
		
		try {
			Statement statement = db.getConnection().createStatement();	
			
			String req = "SELECT TITLE, FIRSTNAME, NAME, NBPAGES " 
							+"FROM BOOK "+
							"INNER JOIN AUTHOR ON BOOK.ID_AUTHOR = AUTHOR.ID "+
							"INNER JOIN CATEGORY ON BOOK.ID_CATEGORY = CATEGORY.ID "+
							"WHERE TITLE LIKE '%"+saisie+"%' "+
							"OR ID_AUTHOR IN (SELECT ID "
											+ "FROM AUTHOR "
											+ "WHERE NAME LIKE '%"+saisie+"%' "
											+ "OR FIRSTNAME LIKE '%"+saisie+"%') "+
							"OR ID_CATEGORY IN (SELECT ID "
												+ "FROM CATEGORY "
												+ "WHERE LABEL LIKE '%"+saisie+"%') "+
							"ORDER BY TITLE;";
			
			ResultSet res = statement.executeQuery(req);
			
			while (res.next()) {
				liste.add(new BookEntity(res.getString("TITLE"), new AuthorEntity(res.getString("FIRSTNAME"), res.getString("NAME")), res.getInt("NBPAGES") ) );
			} 
					
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		
		return liste;
	}
	
	/**
	 * Insertion en deux temps : dans la table BOOK pour livre, puis dans COPY pour le nb copy du BOOK
	 * @param book
	 * @param nbCopy
	 */
	public void insertBook(ArrayList<BookEntity> book){
		
		try {
			Statement statement = db.getConnection().createStatement();
			
			for(BookEntity b : book){
				String req = "INSERT INTO BOOK (ID_AUTHOR, ID_CATEGORY, RESUME, ISBN, TITLE, NBPAGES) values (4,5,'"+ b.getResume()+"', '"+ b.getIsbn()+"', '"+ b.getTitle()+"'"
						+ ", '"+ b.getNbPages()+"')";
				statement.executeUpdate(req);
				
			}
			
		} catch (SQLException e){
			System.err.println("Erreur d'insertion dans la BDD ==> "+e);
		}
	}
	
	
	
	
	

}
