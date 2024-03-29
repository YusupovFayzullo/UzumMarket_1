package uz.market.uzum.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
//    private final OrderRepository orderRepository;
//    private final SessionUser sessionUser;
//    private final ProductOrderRepository productOrderRepository;
//
//
//    public Order addToOrder(AddToOrderDTO addToOrderDTO) {
//        Long userId = sessionUser.id();
//        Collection<ProductOrder> allProducts = productOrderRepository.findALLByIds(addToOrderDTO.productIds());
//        return orderRepository.save(Order.childBuilder()
//                .userId(userId)
//                .status(OrderStatus.NEW)
//                .payment(addToOrderDTO.payment())
//                .products(allProducts)
//                .build());
//    }
//
//
//    @Cacheable(value = "orders", key = "#pageable.pageNumber")
//    public Page<Order> getAllNewOrders(Pageable pageable) {
//        return orderRepository.findAllByStatus(pageable);
//    }
//
//    private final OrderMapper orderMapper;
//    private final OrderPaginationRepository orderPaginationRepository;
//
//    public AddToOrderDTO addToOrderInstallment(AddToOrderDTO addToOrderDTO) {
//        Order order = orderMapper.toOrder(addToOrderDTO);
//        return orderMapper.toAppToOrderDTO(orderRepository.save(order));
//    }
//
//    public AddToOrderDTO getOrderInstallment(Long id) {
//        Order order = orderRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("Order not found"));
//        return orderMapper.toAppToOrderDTO(order);
//    }
//
//    @Cacheable(value = "orders", key = "#pageable.pageNumber")
//    public Page<Order> getAllOrders(Pageable pageable) {
//        return orderRepository.findAllOnPaying(pageable);
//    }
//
//    @CachePut(value = "orders", key = "#id")
//    public Order updateOrderCancel(Long id) {
//        Order order = orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
//        order.setStatus(OrderStatus.CANCELED);
//        return orderRepository.save(order);
//
//    }
//
//    @CachePut(value = "orders", key = "#id")
//    public Order updateOrderStatus(Long id, OrderStatus status) {
//        Order order = orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
//        order.setStatus(status);
//        return orderRepository.save(order);
//    }
//
//    public Order payForInstallment(Order order, Double prices, PayOrderDTO payOrderDTO) {
//        Order orderFound = orderRepository.findById(payOrderDTO.orderId())
//                .orElseThrow(() -> new RuntimeException("Order not found"));
//        if (prices - payOrderDTO.amount() <= 0) {
//            orderFound.setStatus(OrderStatus.COMPLETED);
//            return orderRepository.save(orderFound);
//        } else {
//            throw new RuntimeException("Sum is not enough to complete order");
//        }
//    }
}
