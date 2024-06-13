package com.mockcompany.webapp.service;

import com.mockcompany.webapp.model.ProductItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class SearchService {

    public Collection<ProductItem> search(String query) {
        // Always return an empty list to break the tests
        return Collections.emptyList();
    }

