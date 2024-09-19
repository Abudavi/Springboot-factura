package com.david.curso.springboot.di.factura.springboo_difactura;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.david.curso.springboot.di.factura.springboo_difactura.models.Item;
import com.david.curso.springboot.di.factura.springboo_difactura.models.Product;

@Configuration
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
public class AppConfig {

    @Bean
    @Qualifier
    List<Item> itemsInvoice() {
        Product p1 = new Product("Camara sony", 800);
        Product p2 = new Product("Bicicleta 26", 1200);
        List<Item> items = Arrays.asList(
                new Item(p1, 2),
                new Item(p2, 3));

        return items;
    }

    @Bean
    @Qualifier("itemsOficce")
    List<Item> itemsInvoiceOffice() {
        Product p1 = new Product("Monitor asus 24", 700);
        Product p2 = new Product("Notebook razer", 2400);
        Product p3 = new Product("Impresora hp", 800);
        Product p4 = new Product("Escritorio oficina", 800);
        List<Item> items = Arrays.asList(
                new Item(p1, 2),
                new Item(p2, 3),
                new Item(p3, 6),
                new Item(p4, 4));

        return items;
    }
}
