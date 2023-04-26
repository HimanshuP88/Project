package com.projectbootcamp.ecommerce.entities.order;

import com.projectbootcamp.ecommerce.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor

@NoArgsConstructor
@Entity

public class OrderStatus{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "OrderStatus_generator")
    @SequenceGenerator(name = "OrderStatus_generator",sequenceName = "OrderStatus_seq",initialValue = 1,allocationSize = 50)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Status fromStatus;
    private String toStatus;
    private Date transitionDate;
    private Integer transitionNoteComments;

    @ManyToOne
    @JoinColumn(name="OrderProductId")
    private OrderProduct orderProduct;


}
