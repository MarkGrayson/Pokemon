package pokemon.model;

public class Pokemon 
{
	private String type;
	private String info;
	private int number;
	private double speed;
	private int health;
	private int combat;
	private String name;
	public Pokemon (String name)
	{
		this.name = new String (name);
		this.combat = 75;
		this.health = 120;
		this.speed = 400;
		this.info = new String (info);
		this.type = new String (type);
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	
	public void setAttackPoints(int combat)
	{
		this.combat = 75;
	}
	public int getAttackPoints()
	{
		return combat;
	}
	
	
	public void setHealthPoints(int health)
	{
		this.health = 120;
	}
	public int getHealthPoints()
	{
		return health;
	}
	
	
	public void setSpeed(double speed)
	{
		this.speed = 400;
	}
	public double getSpeed()
	{
		return speed;
	}
	
	
	public void setNumber(int number)
	{
		this.number = number;
	}
	public int getNumber()
	{
		return number;
	}
	
	
	public void setPokemonInformation(String info)
	{
		this.info = info;
	}
	public String getPokemonInformation()
	{
		return info;
	}
	
	
	public void setPokemonTypes(String type)
	{
		this.type = type;
	}
	public String getPokemonTypes()
	{
		return type;
	}
}
