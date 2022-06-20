import javax.swing.*;

public class CellPhoneService
{
	public static void main(String[] args) 
	{
		String no1 = JOptionPane.showInputDialog(null,"Enter the minutes you will use for calls: ","Call Minutes", JOptionPane.QUESTION_MESSAGE);
		int call = Integer.parseInt(no1);
		String no2 = JOptionPane.showInputDialog(null,"Enter the number of text you will use: ","Text", JOptionPane.QUESTION_MESSAGE);
		int text = Integer.parseInt(no2);
		String no3 = JOptionPane.showInputDialog(null,"Enter how much data you will use(in MBs): ","Data", JOptionPane.QUESTION_MESSAGE);
		int data = Integer.parseInt(no3);

		if (call<500&&text==0&&data==0)
			JOptionPane.showMessageDialog(null,"Get plan A for $49 per month!");

		else if (call<500&&text>0&&data==0)
			JOptionPane.showMessageDialog(null,"Get plan B for $55 per month!");

		else if (call>=500&&text<=100&&data==0)
			JOptionPane.showMessageDialog(null,"Get plan C for $61 per month!");

		else if (call>=500&&text>100&&data==0)
			JOptionPane.showMessageDialog(null,"Get plan D for $70 per month!");

		else if (call>0&&text>0&&data<2000)
			JOptionPane.showMessageDialog(null,"Get plan E for $79 per month!");

		else if (call>0&&text>0&&data<4000)
			JOptionPane.showMessageDialog(null,"Get plan F for $87 per month!");


	}
}