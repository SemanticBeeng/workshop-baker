package com.ing.baker.tutorials;

import com.ing.baker.recipe.javadsl.Recipe;
import com.ing.baker.tutorials.interactions.ManufactureGoods;
import com.ing.baker.tutorials.interactions.SendInvoice;
import com.ing.baker.tutorials.interactions.ShipGoods;
import com.ing.baker.tutorials.interactions.ValidateOrder;
import com.ing.baker.tutorials.interactions.events.SensoryEvents;
import com.ing.baker.tutorials.interactions.events.ShipGoodsEvents;
import com.ing.baker.tutorials.interactions.events.ValidateOrderEvents;

import static com.ing.baker.recipe.javadsl.InteractionDescriptor.of;

class WebShopRecipe {
    static Recipe getRecipe() {
        //TODO implement the recipe according to the sequence diagram in docs/sequence.png
        return new Recipe("WebShop")
                .withSensoryEvents(
                    SensoryEvents.OrderPlaced.class,
                    SensoryEvents.CustomerInfoReceived.class,
                    SensoryEvents.PaymentMade.class)
                .withInteractions(
                    of(ValidateOrder.class),
                    of(ManufactureGoods.class)
                        .withRequiredEvents(SensoryEvents.PaymentMade.class, ValidateOrderEvents.OrderValid.class),
                    of(ShipGoods.class),
                    of(SendInvoice.class)
                        .withRequiredEvents(ShipGoodsEvents.GoodsShipped.class));
    }
}
