package pokemon.view;

import java.awt.Color;
import javax.swing.*;
import pokemon.controller.PokemonController;
import java.awt.Dimension;
import java.awt.event.*;

public class PokemonPanel extends JPanel
{
	private PokemonController baseController;
	private ImageIcon pokemonIcon;
	private SpringLayout baseLayout;
	private JButton updateButton;
	private JComboBox pokedexSelecter;
	private JLabel pokemonLabel;
	private JLabel healthLabel;
	private JLabel combatLabel;
	private JLabel speedLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel advancedLabel;
	private JTextField healthField;
	private JTextField combatField;
	private JTextField speedField;
	private JTextField nameField;
	private JTextField numberField;
	private JTextArea advancedArea;
	
	public PokemonPanel(PokemonController baseController)
	
	private void setupPanel()
	{  

{
	this.baseController = baseController;
	this.baseLayout = new SpringLayout();
	this.pokemonIcon = new ImageIcon(getClass().getResource("/poke/view/images/pokeball.png"));
	this.updateButton = new JButton("Update the stats!");
	this.nameField = new JTextField(25);
	this.combatField = new JTextField(5);
	this.healthField = new JTextField(5);
	this.speedField = new JTextField(5);
	this.numberField = new JTextField(5);
	this.advancedArea = new JTextArea(10,25);
	this.pokedexSelecter = new JComboBox(new String[] {"Pickachu","Arcanine","Charizard","Pidgeot","Diglett"});
	this.advancedLabel = new JLabel("Advanced infromation");
	this.combatLabel = new JLabel("Combat Points:");
	this.healthLabel = new JLabel("Health Points:");
	this.speedLabel = new JLabel("Speed Rate");
	this.numberLabel = new JLabel("Pokemon Number:");
	this.nameLabel = new JLabel("My name is:");
	this.pokemonLabel = new JLabel("The current pokemon", pokemonIcon, JLabel.CENTER);

}
	setupPanel();
	setupLayout();
	setupListeners();
	
}





private void setupLayout()
{  }

private void setupDropdown()
{  }

private void setupListeners()
{ 
	pokedexSelecter.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent selection)
		{
			int selected = pokedexSelecter.getSelectedIndex();
			nameField.setText(baseController.getPokedex().get(selected).getName());
			numberField.setText(baseController.getPokedex().get(selected).getNumber() + "");
			combatField.setText(baseController.getPokedex().get(selected).getAttackPoints() + "");
			speedField.setText(baseController.getPokedex().get(selected).getSpeed() + "");
			healthField.setText(baseController.getPokedex().get(selected).getHealthPoints() + "");
			advancedArea.setText(baseController.getPokedex().get(selected).getPokemonInformation()
					+ "\n\n" + baseController.getPokedex().get(selected).getPokemonTypes());
			
		}
	});
	
	
	
}

private void setRandomColor()
{
	int red = (int) (Math.random() * 256);
	int green = (int) (Math.random() * 256);
	int blue = (int) (Math.random() * 256);
}

private void changeColorBasedOnData(String data)
{
	if (data.contains("Electric"))
	{
		this.setBackground(Color.YELLOW);
	}
	else if (data.contains("Fire"))
	{
		this.setBackground(Color.RED);
	}
	else if (data.contains("Flying"))
	{
		this.setBackground(Color.MAGENTA);
	}
	else if (data.contains("Ground"))
	{
		this.setBackground(Color.GRAY);
	}
	
}

private void changeImageDisplay(String name)
{ 
	String path = "/poke/view/images/";
	String defaultName = "/ultraball";
	String extension = ".png";
	try
	{
		pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
	}
	catch (NullPointerException missingFile)
	{
		pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
	}
	pokemonLabel.setIcon(pokemonIcon);
	repaint();
}

private boolean isValidDouble(String input)
{  }

private boolean isValidInteger(String input)
{  }

private boolean isValidName(String name)
{  }
