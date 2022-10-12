import javax.swing.JOptionPane;
public class SammysRentalPrice 
{
	
	public static void main(String[] args) 
	{
		String sammy_border_top = "SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs"; 
		String sammy_border_side = "Ss                      Sammy’s makes it fun in the sun.                    Ss"; 
		String[] options = {"Yes", "No"};
		boolean run = true;
		int min_spent;
		int amount_of_hours = 0;

		double money = 0;
		while(run)
		{
			int choice = JOptionPane.showOptionDialog(null, 
					"Would you like to use Sammy's Seashore Supplies?\nYou have $" + money + " dollars spent here.",
					"Choose an Option.",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.DEFAULT_OPTION,
					null,
					options,
					options[0]);
			
			if (choice == 0)
			{
				JOptionPane.showMessageDialog(null, "On the horizon when travelling, you see a sign...");
				JOptionPane.showMessageDialog(null, sammy_border_top + "\n" + sammy_border_side + "\n" + sammy_border_top);
				String minutes_placeholder = JOptionPane.showInputDialog("Sammy asks.. \"How many minutes are you staying here?\"");
				min_spent = Integer.parseInt(minutes_placeholder);

				//math
				while (min_spent >= 60)
				{
					//calculation for an hour +
					amount_of_hours += 1;
					min_spent -= 60;
				}
				if (min_spent < 60)
				{
					//calculation for just minute(s)
					money += min_spent;
				}
				money += 40 * amount_of_hours;
			}
			else 
			{
				run = false;
			}
		}
	}

}