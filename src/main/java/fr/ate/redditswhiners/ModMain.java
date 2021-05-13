package fr.ate.redditswhiners;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.MultiplayerScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.Widget;
import net.minecraftforge.client.event.GuiScreenEvent.InitGuiEvent;

@Mod("redditswhiners")
public class ModMain {
	public ModMain() {
        MinecraftForge.EVENT_BUS.register(this);
	}
	@SubscribeEvent
    public void onMenuInit(InitGuiEvent.Post ev) {
		//class net.minecraft.client.gui.screen.
		Screen s = ev.getGui();
		if (s instanceof MultiplayerScreen) {
			for (Widget w : ev.getWidgetList()) {
				if (w.getMessage() == DialogTexts.GUI_CANCEL) {
					// cancel button
					w.x += 4;
					w.setWidth(w.getWidth() - 4);
				}
			}
		}
    }
}
