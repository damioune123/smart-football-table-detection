# Smart Football Table - Detection

[![Build Status](https://travis-ci.org/smart-football-table/smart-football-table-detection.svg?branch=master)](https://travis-ci.org/smart-football-table/smart-football-table-detection)
[![BCH compliance](https://bettercodehub.com/edge/badge/smart-football-table/smart-football-table-detection?branch=master)](https://bettercodehub.com/)

This repository contains the detection part of the Smart Football Table project. The position of the ball gets detected and published to the mqtt broker. 

![detection-sample-gif](https://github.com/smart-football-table/smart-football-table.github.io/blob/master/modules/smart-football-table-detection/detectionExampleGif.gif)

Visit the documentation at the [Smart Football Table](https://smart-football-table.github.io/services/ball-detection/) website for more information.
  
### Arguments for the application

| Argument | Description                                   | Sample Input           | default |
| -- | --------------------------------------------------- | ---------------------- | ----- |
| -v | path to an (optional) video file, overwrites camera | "-v path/to/video.avi" | empty |
| -b | length of lightning trace                           | 64                     | 200 |
| -i | index of camera                                     | 0                      | 0 |
| -c | color values (hsvmin,hsvmax) for object you want to detect (unneccessary for yolo) | 20,100,100,30,255,255 | 0,0,0,0,0,0 |
| -r | recording output into given file name               | "fileName"             | empty |
