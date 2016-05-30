package app.controller;

import javax.swing.JFrame;

import app.main.App;
import app.view.BookCreate;
import app.view.BookList;
import app.view.MenuBar;

public class MainController extends Controller {

	private JFrame frame;

	public MainController(JFrame mainView) {
		super();
		frame = mainView;
		//frame.setContentPane(new BookCreate((MenuBar) frame));
		//frame.setContentPane(new BookList((MenuBar) frame));
		((MenuBar) frame).change(MenuBar.BOOK_LIST);
		frame.setVisible(true);
	}
	
	public void setPanel(String panelName) {
		// @TODO Verifier existence de la classe liee au panel, creer Controller
		// affilie
		// frame.setContentPane
		// App.getMainController().setPanel("BookDetail");
		// frame.setContentPane(new BookList((MenuBar)frame));
		// frame.getJMenuBar().getMenu(0);
	}

}