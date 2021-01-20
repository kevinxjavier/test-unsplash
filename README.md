# Credencials Unsplash
**Url:**		https://unsplash.com

**Email:**		xitiga3755@serohiv.com

**User:**		kevinjavier

**Pass:**		123456

# Project SpringBoot

### [Create] from Scratch
```
	$ curl https://start.spring.io/starter.zip?name=test-unsplash&groupId=com.example&artifactId=test-unsplash&version=0.0.1-SNAPSHOT&description=Spring+Boot+Project+for+Test+Unsplash&packageName=com.unsplash.app&type=maven-project&packaging=jar&javaVersion=11&language=java&bootVersion=2.4.2&dependencies=web
```

### [Compile]
```
	$ mvn clean compile package
```

### [Run]
```
	$ mvn spring-boot:run
	
	Or
	
	$ java -jar target/test-unsplash-0.0.1-SNAPSHOT.jar
```

### [Test] endpoints
```
	# Filter By id
	$ curl curl --location --request GET 'http://localhost:8080/collections?filter=1020971' \
--header 'Authorization: ugid=e0173633546d5aac7032d599f1a302c75370477'

	# Filter By title
	$ curl --location --request GET 'http://localhost:8080/collections?filter=The%20Civil%20Rights%20Movement%20in%20Color' \
--header 'Authorization: ugid=e0173633546d5aac7032d599f1a302c75370477'

	# Filter By description
	$ curl --location --request GET 'http://localhost:8080/collections?filter=Gaming.' \
--header 'Authorization: ugid=e0173633546d5aac7032d599f1a302c75370477'

	# Filter By cover_photo.id
	$ curl --location --request GET 'http://localhost:8080/collections?filter=oQbVCT_hN8c' \
--header 'Authorization: ugid=e0173633546d5aac7032d599f1a302c75370477'
```

### [References]
Object JSON to Object Java [link](https://json2csharp.com/)

Share Online Files [link](https://paste.c-net.org/) and then execute **$ curl https://paste.c-net.org/GrownupsHorror --output test-unsplash-0.0.1-SNAPSHOT.jar**
