package org.yearup.data;

import org.yearup.models.*;

public interface ShoppingCartDao {
    ShoppingCart getByUserId(int userId);

    ShoppingCart addToCart(int userId, int productId, int quantity);

    void updateQuantity(int userId, int productId, ShoppingCartItem item);

    ShoppingCart emptyCart(int userId);
}