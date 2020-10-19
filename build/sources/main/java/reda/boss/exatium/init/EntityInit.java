package reda.boss.exatium.init;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import reda.boss.exatium.Main;
import reda.boss.exatium.entity.living.exatium.videur.EntityVideur;
import reda.boss.exatium.utils.References;

public class EntityInit {

    public static void registerEntities() {
        int entityID = 0;
        registerEntity("videur", EntityVideur.class, entityID++, 15, 808080, 404040);
    }

    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
        EntityRegistry.registerModEntity(new ResourceLocation(References.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
    }

    private static void registerNonMobEntity() {

    }
}
