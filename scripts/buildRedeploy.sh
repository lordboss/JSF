#!/bin/sh
asadmin stop-domain
asadmin start-domain
echo "************ UNDEPLOYING *******************"
asadmin undeploy jsfdemo
echo "************ BUILDING **********************"
mvn package
echo "************ DEPLOYING *********************"
asadmin deploy target/jsfdemo.war
