import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class abc extends JFrame {
	private JLabel label = new JLabel("Love Java");
	//메시지 출력 레이블 컴포넌트
	public abc() {
		setTitle("마우스 올리기 내리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		//리스터 객체 생성
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener); //MouseListener등록
		c.addMouseMotionListener(listener); // 등록
		c.add(label);
		setSize(300,200);
		setVisible(true);
	}
	class MyMouseListener implements MouseListener,
		MouseMotionListener { //리스너 2가지를 가진 리스너 작성
		public void mousePressed(MouseEvent e) {
			label.setText("사랑해");
		} //마우스가 눌러진 위치 출력
		public void mouseReleased(MouseEvent e) {
			label.setText("사랑해");
		} //마우스가 떼어진 위치 출력
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {
			Component c = (Component)e.getSource();
			//c.setBackground(Color.CYAN);
		} //마우스가 올라간 컴포넌트를 알아낸다.
		public void mouseExited(MouseEvent e) {
			Component c = (Component)e.getSource();
			label.setText("Love Java");
		} //마우스가 내려간 컴포넌트를 알아낸다.
		public void mouseDragged(MouseEvent e) {
			label.setText("사랑해");
		} //마우스가 드래깅되는 동안 계속 호출
		public void mouseMoved(MouseEvent e) {
			label.setText("사랑해");
		} //마우스가 움직인 동안 계속 호출
	}
	public static void main(String [] args) {
		new abc();
	}
}