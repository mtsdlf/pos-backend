package com.dela;

import java.util.List;

import io.quarkus.panache.common.Sort;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/products")
@ApplicationScoped
public class ProductResource {

@GET
public Uni<List<Product>> get() {
    return Product.listAll(Sort.by("name"));
}
}
