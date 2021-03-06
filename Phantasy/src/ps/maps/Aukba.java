package ps.maps;

import static ps.oo.PSGame.EntFinish;
import static ps.oo.PSGame.EntStart;
import static ps.oo.PSGame.Shop;
import static ps.oo.PSGame.getItem;
import static ps.oo.PSGame.getString;
import static ps.oo.PSGame.getYesNo;
import static ps.oo.PSGame.mapswitch;
import ps.oo.Dungeon;
import ps.oo.Item;
import ps.oo.PSGame;
import ps.oo.PSLibItem.OriginalItem;
import ps.oo.PSMenu;
import ps.oo.PSMenu.DezoType;
import ps.oo.PSMenu.EntityType;
import ps.oo.PSMenu.Scene;
import ps.oo.PSMenu.SpecialEntity;

public class Aukba {
	
	public static void hospital() {
		PSMenu.startScene(Scene.HOSPITAL_VILLAGE, EntityType.DEZO, DezoType.REGULAR);
		PSGame.Hospital(3); // Pricey!
		PSMenu.endScene();
	}

	public static void church() {
		PSMenu.startScene(Scene.CHURCH_VILLAGE, EntityType.DEZO, DezoType.REGULAR);
		PSGame.Church(3); // Pricey!
		PSMenu.endScene();
	}
	
	public static void hand_shop() {
		PSMenu.startScene(Scene.SHOP_HAND_VILLAGE, EntityType.DEZO, DezoType.REGULAR);
		Shop(getString("Shop_Tool_Welcome"), true, new Item[]{	getItem(OriginalItem.Inventory_Flash),
																	getItem(OriginalItem.Inventory_Escape_Cloth),
																	getItem(OriginalItem.Inventory_TranCarpet)});
		PSMenu.endScene();
	}	

	public static void icedigger_shop() {
		PSMenu.startScene(Scene.SHOP_HAND_VILLAGE, EntityType.DEZO, DezoType.REGULAR);
		Shop(getString("Shop_Tool_Welcome"), true, new Item[]{	getItem(OriginalItem.Vehicle_IceDecker)});
		PSMenu.endScene();
	}	

	public static void lefthouse1() {
		PSMenu.startScene(Scene.VILLAGE_HOUSE, EntityType.DEZO, DezoType.REGULAR);
		PSMenu.Stext(getString("Aukba_Left_House_1"));
		PSMenu.endScene();
	}
	public static void lefthouse2() {
		PSMenu.startScene(Scene.VILLAGE_HOUSE, EntityType.DEZO, DezoType.REGULAR);
		PSMenu.Stext(getString("Aukba_Left_House_2"));
		PSMenu.endScene();
	}
	public static void lefthouse3() {
		PSMenu.startScene(Scene.VILLAGE_HOUSE, EntityType.DEZO, DezoType.REGULAR);
		PSMenu.Stext(getString("Aukba_Left_House_3"));
		PSMenu.endScene();
	}
	public static void lefthouse4() {
		PSMenu.startScene(Scene.VILLAGE_HOUSE, EntityType.DEZO, DezoType.REGULAR);
		PSMenu.Stext(getString("Aukba_Left_House_4"));
		PSMenu.endScene();
	}
	public static void lefthouse5() {
		PSMenu.startScene(Scene.VILLAGE_HOUSE, EntityType.DEZO, DezoType.REGULAR);
		if(PSMenu.Prompt(getString("Aukba_Left_House_5"), getYesNo()) == 1) {
			PSMenu.StextLast(getString("Aukba_Left_House_5Yes"));
		} else {
			PSMenu.StextLast(getString("Aukba_Left_House_5No"));
		}
		PSMenu.endScene();
	}
	public static void lefthouse6() {
		PSMenu.startScene(Scene.VILLAGE_HOUSE, EntityType.DEZO, DezoType.REGULAR);
		PSMenu.Stext(getString("Aukba_Left_House_6"));
		PSMenu.endScene();
	}

	public static void righthouse1() {
		PSMenu.startScene(Scene.VILLAGE_HOUSE, EntityType.DEZO, DezoType.REGULAR);
		PSMenu.Stext(getString("Aukba_Right_House_1"));
		PSMenu.endScene();
	}
	public static void righthouse2() {
		PSMenu.startScene(Scene.VILLAGE_HOUSE, EntityType.DEZO, DezoType.REGULAR);
		PSMenu.Stext(getString("Aukba_Right_House_2"));
		PSMenu.endScene();
	}
	public static void righthouse3() {
		PSMenu.startScene(Scene.VILLAGE_HOUSE, EntityType.DEZO, DezoType.REGULAR);
		PSMenu.Stext(getString("Aukba_Right_House_3"));
		PSMenu.endScene();
	}
	public static void righthouse4() {
		PSMenu.startScene(Scene.VILLAGE_HOUSE, EntityType.DEZO, DezoType.REGULAR);
		PSMenu.Stext(getString("Aukba_Right_House_4"));
		PSMenu.endScene();
	}
	public static void righthouse5() {
		PSMenu.startScene(Scene.VILLAGE_HOUSE, EntityType.DEZO, DezoType.REGULAR);
		PSMenu.Stext(getString("Aukba_Right_House_5"));
		PSMenu.endScene();
	}

	public static void righthouse6() {
		PSMenu.startScene(Scene.VILLAGE_HOUSE, EntityType.DEZO, DezoType.REGULAR);
		PSMenu.Stext(getString("Aukba_Right_House_6"));
		PSMenu.endScene();
	}

	public static void ent1() {
		EntStart();
		PSMenu.Stext(getString("Aukba_Left_Ent"));
		EntFinish();
	}
	public static void ent2() {
		EntStart();
		PSMenu.Stext(getString("Aukba_Right_Ent"));
		EntFinish();
	}

	public static void tunnel() {
		mapswitch(Dungeon.AUKBA_TUNNEL_OUT);
	}
	
	
}
