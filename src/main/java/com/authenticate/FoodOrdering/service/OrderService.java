package com.authenticate.FoodOrdering.service;

import com.authenticate.FoodOrdering.dto.request.OrderRequest;
import com.authenticate.FoodOrdering.dto.response.Response;
import com.authenticate.FoodOrdering.exception.SaveException;

public interface OrderService {

    Response placeOrder(OrderRequest orderRequest) throws SaveException;
    Response viewOrdersByUser(Long userId);
   Response totalOrderPerUser(Long userId);
//   Response totalOrders();


    Response viewOrderByStatus(String status);

   /* void updateOrderStatus();*/


}