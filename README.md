
Alexa Web Information Service is a bit of a mess. This is an attempt to provide a client that works. 

The response classes return by the client are generated by JAXB. They will work but it feel like Amazon did a patch on some old legacy system to get this service to work. So you end up with typical over engineered Java class structure. This is something I plan to improve by replacing JAXB with simple response classes. 

This client simplify requesting these services. Below is the example of calls to AWIS.

## Credentials

The client accept Amazon AWS SDk credientials. Remember AWIS service only work with ROOT access key and secret. You can't use Amazon AWS AMI credentials.

```java
DefaultAWSCredentialsProviderChain defaultAWSCredentialsProviderChain = new DefaultAWSCredentialsProviderChain();
credentials = defaultAWSCredentialsProviderChain.getCredentials();
```

## UrlInfo

The UrlInfo action provides information about a website, such as:

* how popular the site is
* what sites are related
* contact information for the owner of the site

 
```java
AlexaWebInformationServiceClient client = new AlexaWebInformationServiceClient(credentials);

UrlInfoRequest request = new UrlInfoRequest();
request.setResponseGroups(Arrays.asList(GetUrlInfoResponseGroup.values()));
request.setUrl("www.bryght.com");

UrlInfoResponse response = client.getUrlInfo(request);

Assert.assertNotNull(response);
Assert.assertNotNull(response.getResponse());
Assert.assertNotNull(response.getResponse().getUrlInfoResult().get(0));
Assert.assertNotNull(response.getResponse().getUrlInfoResult().get(0).getAlexa().getContactInfo());
Assert.assertNotNull(response.getResponse().getUrlInfoResult().get(0).getAlexa().getContentData());
Assert.assertNotNull(response.getResponse().getUrlInfoResult().get(0).getAlexa().getRelated());
Assert.assertNotNull(response.getResponse().getUrlInfoResult().get(0).getAlexa().getTrafficData());
```


## TrafficHistory

The TrafficHistory action returns the daily Alexa Traffic Rank, Reach per Million Users, and Unique Page Views per Million Users for each day since August 2007. This same data is used to produce the traffic graphs found on alexa.com.

```java
AlexaWebInformationServiceClient client = new AlexaWebInformationServiceClient(credentials);

TrafficHistoryRequest request = new TrafficHistoryRequest();
request.setUrl("www.bryght.com");
request.setRange(20);

Calendar start = GregorianCalendar.getInstance();
start.set(Calendar.YEAR, 2015);
start.set(Calendar.MONTH, 1);
start.set(Calendar.DAY_OF_MONTH, 1);

request.setStart(start.getTime());

TrafficHistoryResponse response = client.getTrafficHistory(request);
       
Assert.assertNotNull(response);
Assert.assertNotNull(response.getResponse());
Assert.assertNotNull(response.getResponse().getTrafficHistoryResult().get(0));
Assert.assertNotNull(response.getResponse().getTrafficHistoryResult().get(0).getAlexa().getTrafficHistory());
```

## CategoryBrowse

The CategoryBrowse action and CategoryListings actions together provide a directory service based on the Open Directory, www.dmoz.org, and enhanced with Alexa traffic data.

For any given category, the CategoryBrowse action returns a list of sub-categories. Within a particular category you can use the CategoryListings action to get the documents within that category ordered by traffic.


```java
AlexaWebInformationServiceClient client = new AlexaWebInformationServiceClient(credentials);

CategoryBrowseRequest request = new CategoryBrowseRequest();
request.setResponseGroups(Arrays.asList(CategoryBrowseResponseGroup.values()));
request.setPath("Top/Shopping");
request.setDescriptions(Boolean.TRUE);

CategoryBrowseResponse response = client.getCategoryBrowse(request);

Assert.assertNotNull(response);
Assert.assertNotNull(response.getResponse());
Assert.assertNotNull(response.getResponse().getCategoryBrowseResult().get(0));
Assert.assertNotNull(response.getResponse().getCategoryBrowseResult().get(0).getAlexa().getCategoryBrowse());
```

## CategoryListings

The CategoryListings action is a directory service based on the Open Directory, www.dmoz.org. For any given category, it returns a list of site listings contained within that category.

```java
AlexaWebInformationServiceClient client = new AlexaWebInformationServiceClient(credentials);
 
CategoryListingsRequest request = new CategoryListingsRequest();
request.setPath("Top/Business/Automotive");
request.setRecursive(Boolean.TRUE);
request.setStart(1);;
request.setCount(15);
request.setSortBy(SortBy.Popularity);
request.setDescriptions(Boolean.TRUE);

CategoryListingsResponse response = client.getCategoryListings(request);

Assert.assertNotNull(response);
Assert.assertNotNull(response.getResponse());
Assert.assertNotNull(response.getResponse().getCategoryListingsResult().get(0));
Assert.assertNotNull(response.getResponse().getCategoryListingsResult().get(0).getAlexa().getCategoryListings());
```

## SitesLinkingIn

The SitesLinkingIn action returns a list of web sites linking to a given web site. Within each domain linking into the web site, only a single link - the one with the highest page-level traffic - is returned.

WARNING: Last time i check Amazon was not returning any results for this service.

```java
AlexaWebInformationServiceClient client = new AlexaWebInformationServiceClient(credentials);

SitesLinkingInRequest request = new SitesLinkingInRequest();
request.setUrl("www.bryght.com");
request.setStart(0);
request.setCount(15);

SitesLinkingInResponse response = client.getSitesLinkingIn(request);

Assert.assertNotNull(response);
Assert.assertNotNull(response.getResponse());
Assert.assertNotNull(response.getResponse().getSitesLinkingInResult().get(0));
Assert.assertNotNull(response.getResponse().getSitesLinkingInResult().get(0).getAlexa().getSitesLinkingIn()); 
```

## Maven Dependencies 	

You can use the the library my adding following dependencies in your maven project.

```xml
<repositories>
	<repository>
		<id>tahseen.distributary.net</id>
		<name>tahseen.distributary.net</name>
		<url>http://tahseen.distributary.net/release/</url>
		<snapshots>
			<enabled>false</enabled>
		</snapshots>
	</repository>
</repositories>

<dependencies>
	<dependency>
		<groupId>net.distributary.tahseen</groupId>
		<artifactId>aws-java-sdk-awis</artifactId>
		<version>0.1</version>
	</dependency>
</dependencies>
```
