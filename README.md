# CI/CD Sample
A simple CI/CD pipeline to deploy in GKE with Cloud Build 
for a Spring Boot application whose code resides in GitHub.

````
-> Push Code to Github branch 
    -> Automatic Trigger Build 
        -> Runs Maven Test 
            -> Runs Maven Build to create the jar file
                -> Creates Docker image 
                    -> Pushes image to GCR 
                        -> Deploys image to GKE
````

Cloud Build connects to the GitHub repo using Cloud Build GitHub App 
and the trigger for the build is any push to the repo.