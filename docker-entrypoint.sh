#!/usr/bin/env sh

[ -z "$MODEL_PATH" ] && MODEL_PATH=/darknet/yolov3-models/modelFromCOM19/files/
cd $MODEL_PATH && python3 -u /darknet/darknet_video.py -s "$MQTTHOST" -p "$MQTTPORT"

