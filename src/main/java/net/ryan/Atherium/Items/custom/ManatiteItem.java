package net.ryan.Atherium.Items.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import org.jetbrains.annotations.NotNull;

public class ManatiteItem extends Item{
    public ManatiteItem(Item.Properties pProperties){
        super(pProperties);
    }

    @Override
    public @NotNull InteractionResult useOn(UseOnContext pContext) {
        Player player = pContext.getPlayer();
        assert player != null;
        player.sendSystemMessage(Component.literal("This would give you mana, but idk how yet"));
        pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(),
                pllayer -> pllayer.broadcastBreakEvent(pllayer.getUsedItemHand()));

        return InteractionResult.SUCCESS;
    }
}
