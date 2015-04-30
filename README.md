JBoss Feedhenry and Fuse (Camel) Integration Demo  
=================================================  
CURRENTLY IN PROGRESS   
Overview Article Released
UC1 Article Released
UC2-UC4 to be released
  
This demo project will get you started with SAP, SF, Feedhenry and Fuse Integration.  

![Demo Overview](https://raw.githubusercontent.com/jbossdemocentral/fh-fuse-sap-sf-integration-demo/master/docs/demo-images/sap-fuse-sf-feedhenry.png)
  
Use Case 1: PC-SF-Fuse-SAP (JCO&NGW consume/produce or vv)  
-Closed opportunity in SFDC creates a customer record in SAP  
Use Case 2: FH-SF-Fuse-SAP (JCO&NGW consume/produce or vv)  
-Closed opportunity via mobile app, updates the associated opportunity in SFDC and creates a customer record in SAP  
Use Case 3: PC-SAP-Fuse-SF (w/o mobile)  
-Update customer status in SAP (Delayed payments), associated opportunity in SFDC for this customer reflects the new customer status  
Use Case 4: PC-SAP-Fuse-SF (mobile)  
-Update customer status in SAP (Delayed payments),put the customer 'ON HOLD' via the mobile app, and associated opportunity in SFDC for this customer reflects the updated customer statis (ON HOLD)  
  
Local Install Option:  
---------------------    

1. [Download and unzip.](https://github.com/DataVirtualizationByExample/dv-fuse-integration-demo/archive/master.zip).  If running on Windows, it is reccommended the project be extracted to a location near the root drive path due to limitations of length of file/path names.  
  
2. Add Fuse Products to the software directory.  
  
3. Run 'init.sh' or 'init.bat' to setup the environment locally. 'init.bat' must be run with Administrative privileges.  
  
4. Run 'run.sh' or 'run.bat' to start the servers, create the container and deploy the bundles.  
  
5. Sign onto the Fuse Management console and check the console log to see the output from the routes for the use cases.  You can also view the Camel Diagrams.  
  
  
Docker Option:  
------------  
  
In Progress  
  
Openshift Option:  
------------  
In Progress  
  
Coming soon:
------------
   
   * more demo ideas?

Supporting Articles
-------------------
N/A  

Released versions
-----------------

See the tagged releases for the following versions of the product:

- v1.0.0 - IN PROGRESS
