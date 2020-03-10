## Micoservices with Istio : example using bookinfo application
- productpage. The productpage microservice calls the details and reviews microservices to populate the page.
- details. The details microservice contains book information.
- reviews. The reviews microservice contains book reviews. It also calls the ratings microservice.
- ratings. The ratings microservice contains book ranking information that accompanies a book review.

There are 3 versions of the reviews microservice:

- Version v1 doesn’t call the ratings service.
- Version v2 calls the ratings service, and displays each rating as 1 to 5 black stars.
- Version v3 calls the ratings service, and displays each rating as 1 to 5 red stars.
The end-to-end architecture of the application is shown below.

![alt text](https://www.beopenit.com/wp-content/uploads/2020/02/Capture-du-2020-02-20-15-27-09-1024x709.jpg)

In templates folder we have:
- bookinfo.yml: kubernetes templates dor deployment
- networking/bookinfo-gateway.yml: to deploy Istio ingress gateway
