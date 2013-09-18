package net.voxelpg;

import net.voxelpg.screen.Graphics;
import net.voxelpg.world.Tileset;
import processing.core.PApplet;

@SuppressWarnings("serial")
public class Voxelpg extends PApplet{
	
	public static void main(String[] args) {
		PApplet.main("net.voxelpg.Voxelpg", args);
	}
	
	@Override
	public void setup() {
		size(1280, 720);
		frame.setTitle("Voxel Playground!");
		Tileset.initTileset(this);
		Tileset.buildTiles();
		frameRate(60);
	}
	
	public void draw() {
		background(60, 100, 255);
		Graphics.draw(this);
	}

}
