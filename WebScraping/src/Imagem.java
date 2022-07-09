import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Imagem extends JFrame{
	
	ImageIcon imagem = new ImageIcon(getClass().getResource("dor.png"));
	JLabel label = new JLabel(imagem);
	
	public Imagem(){
		add(label);
		
		setSize(2500,1500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(this);
		setVisible(true);
	

}
	public static void main (String[]args) {
		new Imagem();
		
	}
}
