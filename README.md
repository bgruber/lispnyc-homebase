# Website for LispNYC.org

It's not perfect, contains Unix-isims and in some ways is suboptimal (see mail
handling), but works and is a growing work in progress.

## Requirements

In order to compile and run the project, either stand-alone or within
the Jetty webapp framework, it requires:

  * java
  * [leiningen](https://github.com/technomancy/leiningen)
  * or maven
  * [lispnyc-jetty project](https://github.com/heow/lispnyc-jetty)
  
Some resources from the *lispnyc-jetty* project are used directly here, they're symlinked (or copied) over:

    homebase-data        -> your-jetty-install-directory/homebase-data
    pebbleblog-articles  -> your-jetty-install-directory/pebbleblog-articles
    html                 -> src/html
    src/html/static      -> your-jetty-install-directory/homebase-static 

The *static* directory is copied directly from the lispnyc-jetty project because Jetty won't easily serve up symlinked directories.  Just keep that in mind so that HTML modifications don't get out of sync between the Standalone nad WAR operation.

## Running Standalone 

There are two ways to run this, standalone or via a WAR deployment along with the other webapps.  Running standalone is quicker but you don't get access to the blog system, only the blog data.

It's pretty easy, just run:

    ./make-symlinks.sh # only run this once
    lein deps
    ./start

Look at *http://localhost:8000*

## WAR Deployment

First some caveats: we're having trouble running the webapp as an
actual war due to simplecms and Clojure's compiled functions.  For now
we expand the LispNYC homebase WAR in the webapp directory of the lispnyc-jetty project. This is done by the *build-deploy.sh* script.

    ./make-symlinks.sh # only run this once
    ./build-deploy.sh


Then make sure the [lispnyc-jetty project](https://github.com/heow/lispnyc-jetty) and look at *http://localhost:8000*



