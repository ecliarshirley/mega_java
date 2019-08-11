package inter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class 모든처리기 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		String who = e.getActionCommand();
				
		JOptionPane.showMessageDialog(null, who +"를 누르셨군요");
		
		if (who.equals("빨강신호")) {
//			JOptionPane.showMessageDialog(null, "조심하세요");
			JOptionPane.showMessageDialog(null, "조심하세요", "빨강신호메세지", JOptionPane.OK_OPTION);
		} else if (who.equals("노랑신호")) {
			JOptionPane.showMessageDialog(null, "주의하세요", "노랑신호메세지", JOptionPane.WARNING_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "안전합니다", "파랑신호메세지", JOptionPane.INFORMATION_MESSAGE);
			
		}
		
		
	}

}
