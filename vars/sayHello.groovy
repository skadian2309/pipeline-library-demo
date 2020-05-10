#!/usr/bin/env groovy

def call(Map config=[:], Closure body ) {
   // echo  config.deploy
    
    pipeline {
    agent {
         label 'maven'
    }
                    body()

}

}

