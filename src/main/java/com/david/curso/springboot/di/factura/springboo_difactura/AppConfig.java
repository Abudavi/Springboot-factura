package com.david.curso.springboot.di.factura.springboo_difactura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.david.curso.springboot.di.factura.springboo_difactura.models.Item;
import com.david.curso.springboot.di.factura.springboo_difactura.models.Product;

@Configuration
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
public class AppConfig {

    @Bean
    List<Item> itemsInvoice() {
        Product p1 = new Product("Camara sony", 800);
        Product p2 = new Product("Bicicleta 26", 1200);
        List<Item> items = Arrays.asList(
                new Item(p1, 2),
                new Item(p2, 3));

        return items;
    }
}
