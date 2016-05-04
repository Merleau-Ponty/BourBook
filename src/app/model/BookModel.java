package app.model;


import java.sql.*;
import java.util.ArrayList;

import app.database.Database;
import app.entity.BookEntity;
import app.entity.Entity;

public class BookModel extends Model {

	public BookModel(Database db) {
		super(db);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * liste l'ensemble des books existants 
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
	 * retourne le ou les livres comprenant la lettre mentionnée en paramètre
	 * @param titre
	 * @return ArrayList de Book
	 */
	public ArrayList<BookEntity> searchTitle(String titre){
		ArrayList<BookEntity> liste = new ArrayList<BookEntity>();
		
		try {
			Statement statement = db.getConnection().createStatement();	
			
			String req = "Select TITLE, RESUME, NBPAGES from BOOK  where TITLE like '%"+ titre+"%' ORDER BY TITLE;";
			
			ResultSet res = statement.executeQuery(req);
			
			while (res.next()) {
				liste.add(new BookEntity(res.getString("TITLE"), res.getString("RESUME"), res.getInt("NBPAGES") ) );
			} 
					
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		
		return liste;
		
	}
	
	/**
	 * retourne les livres écrit par un auteur comprenant le caractère mentionné
	 * @param auteur
	 * @return ArrayList de Book
	 */
	public ArrayList<BookEntity> searchAuteur(String auteur){
		ArrayList<BookEntity> liste = new ArrayList<BookEntity>();
		
		try {
			Statement statement = db.getConnection().createStatement();	
			
			String req = "Select TITLE, RESUME, NBPAGES from BOOK INNER JOIN"
					+ " AUTHOR ON BOOK.ID_AUTHOR = AUTHOR.ID "
					+ " where AUTHOR.NAME like '%"+ auteur+"%'"
					+ " OR AUTHOR.FIRSTNAME like'%"+ auteur +"%' "
					+ " ORDER BY AUTHOR.NAME, AUTHOR.FIRSTNAME, TITLE;";
			
			
			ResultSet res = statement.executeQuery(req);
			
			while (res.next()) {
				liste.add(new BookEntity(res.getString("TITLE"), res.getString("RESUME"), res.getInt("NBPAGES") ) );
			} 
					
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		
		return liste;
		
	}
	
	/**
	 *  retourne les livres appartenant à une certaine catégorie
	 * @param categ
	 * @return ArrayList de Book
	 */
	public ArrayList<BookEntity> searchCateg(String categ){
		ArrayList<BookEntity> liste = new ArrayList<BookEntity>();
		
		try {
			Statement statement = db.getConnection().createStatement();	
			
			String req = "Select TITLE, RESUME, NBPAGES from BOOK INNER JOIN "
					+ " CATEGORY ON BOOK.ID_CATEGORY = CATEGORY.ID "
					+ " where BOOK.ID_CATEGORY IN ( SELECT ID "
					+ "from CATEGORY "
					+ "where LABEL like '%"+ categ +"%' ) " 
					+ "ORDER BY CATEGORY.LABEL, TITLE;";
			
			
			ResultSet res = statement.executeQuery(req);
			
			while (res.next()) {
				liste.add(new BookEntity(res.getString("TITLE"), res.getString("RESUME"), res.getInt("NBPAGES") ) );
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
	public void insertBook(ArrayList<BookEntity> book, int nbCopy){
		
		try {
			Statement statement = db.getConnection().createStatement();
//			Statement statement2 = db.getConnection().createStatement();
			
			for(BookEntity b : book){
				String req = "INSERT INTO BOOK (RESUME, ISBN, TITLE, NBPAGES) values ('"+ b.getResume()+"', '"+ b.getIsbn()+"', '"+ b.getTitle()+"'"
						+ ", '"+ b.getNbPages()+"')";
				statement.executeUpdate(req);
				
			}
			
//			String req2 = "INSERT INTO COPY"
		} catch (SQLException e){
			System.err.println("Erreur d'insertion dans la BDD ==> "+e);
		}
	}
	
	
	
	
	

}
