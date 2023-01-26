import javax.swing.*;
public class BookDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String author = JOptionPane.showInputDialog("Input author name:");
		String email = JOptionPane.showInputDialog("Input author e-mail:");
		String title = JOptionPane.showInputDialog("Input book title:");
		int page = Integer.parseInt(JOptionPane.showInputDialog("Input book page:"));
		int choice = JOptionPane.showConfirmDialog(null, 
				"Is that page correct?",title, JOptionPane.YES_NO_OPTION);
		while(choice==1) {
			page = Integer.parseInt(JOptionPane.showInputDialog("Input book page,again:"));
			choice = JOptionPane.showConfirmDialog(null, 
					"Is that page correct?",title, JOptionPane.YES_NO_OPTION);
		}
		Book1 book = new Book1(title,new Author1(author,email),page);
		JOptionPane.showMessageDialog(null, "Book title : "+title
				+"\nAuthor name :"+author+"("+page+")"
				+"\nAuthor e-mail:"+email);
		
		
		
	}

}
