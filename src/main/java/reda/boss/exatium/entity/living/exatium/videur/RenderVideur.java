package reda.boss.exatium.entity.living.exatium.videur;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import reda.boss.exatium.utils.References;

@SideOnly(Side.CLIENT)
public class RenderVideur extends RenderLiving<EntityVideur> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(References.MODID + ":textures/entity/049.png");

    public RenderVideur(RenderManager manager) {
        super(manager, new ModelVideur(), 0.5f);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityVideur entity) {
        return TEXTURE;
    }
}
