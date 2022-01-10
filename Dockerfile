FROM python:slim-buster
ADD hello_world.py /home/hello_world.py
CMD ["python","-u","hello_world.py"]
