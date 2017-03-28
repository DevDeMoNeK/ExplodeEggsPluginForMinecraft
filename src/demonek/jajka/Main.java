package demonek.jajka;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	public void onEnable(){
		saveDefaultConfig();
		this.getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
	void gdyJajkoWyrzucone(PlayerEggThrowEvent e){
		int moc = this.getConfig().getInt("Moc");
		e.getEgg().getLocation().getWorld().createExplosion(e.getEgg().getLocation(), (float)moc, true);
		
	}

}