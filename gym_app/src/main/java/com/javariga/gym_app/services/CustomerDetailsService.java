//package com.javariga.gym_app.services;
//
//import com.javariga.gym_app.repository.CustomerRepository;
//import com.javariga.gym_app.repository.RoleRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class CustomerDetailsService implements  {
//
//    private final RoleRepository roleRepository;
//    private final CustomerRepository customerRepository;
//    private final PasswordEncoder passwordEncoder;
//
//
//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//
//        var customer = customerRepository.findByPersonalCode(s)
//                .orElseThrow(() -> new RuntimeException("Customer not found"));
//        var authorities = mapRolesToAuthorities(customer.getRoles());
//
//        return null;
//    }
//}
