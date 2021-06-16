package com.ibm.order;


import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Order implements Serializable {
	
	
	//private static final long serialVersionUID = -2011758934216666506L;
	private Integer orderId;
	private Date date;
	private Integer quantity;
	private transient String orderBy;
	//private boolean isCompleted;

}
