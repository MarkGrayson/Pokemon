package pokemon.view;

import javax.swing.JFrame;

import java.awt.Dimension;

import pokemon.controller.PokemonController;

public class PokemonFrame extends JFrame
{
	
	private PokemonController baseController;
	private PokemonPanel appanel ;
	
	public PokemonFrame(PokemonController baseController)
	{
		super();
		this.baseController = baseController;
		this.appanel = new PokemonPanel(baseController);
		
		this.setupFrame();
	}
	/**
	 * Sets up Frame with Title ContentPane Size and Visible
	 */
	private void setupFrame()
	{
		this.setContentPane(appanel);;
		this.setTitle("Pokemon");;
		this.setSize(new Dimension(600, 400));
		this.setVisible(true);
	}
	
	
}
