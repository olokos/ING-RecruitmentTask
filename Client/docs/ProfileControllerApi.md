# ProfileControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**descriptor111**](ProfileControllerApi.md#descriptor111) | **GET** /profile/vehicleEntities | 
[**listAllFormsOfMetadata1**](ProfileControllerApi.md#listAllFormsOfMetadata1) | **GET** /profile | 


<a name="descriptor111"></a>
# **descriptor111**
> String descriptor111()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProfileControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ProfileControllerApi apiInstance = new ProfileControllerApi(defaultClient);
    try {
      String result = apiInstance.descriptor111();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileControllerApi#descriptor111");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/alps+json, application/schema+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="listAllFormsOfMetadata1"></a>
# **listAllFormsOfMetadata1**
> RepresentationModelObject listAllFormsOfMetadata1()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProfileControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ProfileControllerApi apiInstance = new ProfileControllerApi(defaultClient);
    try {
      RepresentationModelObject result = apiInstance.listAllFormsOfMetadata1();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileControllerApi#listAllFormsOfMetadata1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RepresentationModelObject**](RepresentationModelObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

