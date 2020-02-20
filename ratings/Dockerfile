FROM node:10

ENV PORT 8080
WORKDIR /usr/src/app

COPY package.json ./

RUN npm install

COPY server.js ./

EXPOSE ${PORT}
CMD [ "node", "server.js" ]
