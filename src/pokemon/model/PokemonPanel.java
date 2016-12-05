package pokemon.model;

import java.awt.Color;
import javax.swing.*;
import pokemon.controller.PokemonController;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

	
	setupPanel();
	setupLayout();
	setupListeners();
	
}
}


private void setupPanel()
{  }

private void setupLayout()
{  }

private void setupDropdown()
{  }

private void setupListeners()
{  }

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
	
}

private void changeImageDisplay(String name)
{  }

private boolean isValidDouble(String input)
{  }

private boolean isValidInteger(String input)
{  }

private boolean isValidName(String name)
{  }
