package com.hxb.dao;

import com.hxb.po.Customer;

public interface CustomerDao {
  Customer findCustomerById(Integer id);
}
