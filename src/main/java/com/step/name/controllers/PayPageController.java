package com.step.name.controllers;

import com.step.name.model.Order;
import com.step.name.model.User;
import com.step.name.service.GoodService;
import com.step.name.service.OrderGoodServise;
import com.step.name.service.OrderService;
import com.step.name.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/PayPage")
public class PayPageController {
    private static final Logger LOGGER = LogManager.getLogger(ShopFirstController.class);

    private final OrderService orderService;
    private final GoodService goodService;
    private final OrderGoodServise orderGoodServise;
    private final UserService userService;

    public PayPageController(OrderService orderService, GoodService goodService,
                             OrderGoodServise orderGoodServise, UserService userService) {
        this.orderService = orderService;
        this.goodService = goodService;
        this.orderGoodServise = orderGoodServise;
        this.userService = userService;
    }

    @PostMapping()
    public ModelAndView doOrder(HttpServletRequest request, HttpServletResponse response) {
        final ModelAndView model = new ModelAndView("PayPage");

       // User user = (User) request.getSession().getAttribute("user");
        Order order = (Order) request.getSession().getAttribute("order");

        model.addObject("ResultList", orderGoodServise.getResultList(order));
        model.addObject("ResultSum", orderService.getSumm(order));
        return model;
    }

}
