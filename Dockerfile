# base image
FROM valian/docker-python-opencv-ffmpeg

COPY requirements.txt ./
RUN pip install -r requirements.txt

# add code
RUN mkdir /usr/src/sft
COPY . /usr/src/sft

RUN apt-get update
RUN apt-get install -y openjdk-8-jdk

RUN java -version
