package net.starype.minigameapi.features.teams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class Team {
	
	private String name;
	private String color;
	private List<Player> players;
	private Location spawn;
	
	public Team(String name, String color) {
		
		this.setName(name);
		this.setColor(color);
		this.players = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void addPlayer(Player player) {
		players.add(player);
	}

	public void addSpawn(Location location) {
		this.spawn = location;
	}
	
	public Optional<Location> getSpawn() {
		
		return Optional.ofNullable(spawn);
	}
}