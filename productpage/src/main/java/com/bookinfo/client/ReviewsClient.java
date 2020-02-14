package com.bookinfo.client;

import java.util.List;

public interface ReviewsClient {
    List<Object> getReviews(int idProduct);
}
