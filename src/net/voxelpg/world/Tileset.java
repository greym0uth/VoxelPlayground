package net.voxelpg.world;

import processing.core.PApplet;

public class Tileset {
	public static int Tiles[][];
	public static PApplet h;
	
	public static void initTileset(PApplet host) {
		h = host;
		Tiles = new int [h.width/30+1][h.height/30+1];
	}
	
	public static void buildTiles() {
		for (int i = 0; i < Tiles.length; i++) {
			for (int j = 0; j < Tiles[i].length; j++) {
				Tiles[i][j] = 100;
			}
		}
	}
	
	public static void draw() {
		for (int x = 0; x < Tiles.length; x++) {
			for (int y = 0; y < Tiles[x].length; y++) {
				h.fill(Tiles[x][y]);
				h.noStroke();
				h.rect(x*30, y*30, 30, 30);
			}
		}
	}

}
