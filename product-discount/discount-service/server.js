const {createServer} = require("grpc-kit");
const server = createServer();
const discountService = require("./service/discountService");

server.use({
  protoPath: "./proto/product_info.proto",
  packageName: "productDiscount",
  serviceName: "ProductDiscount",
  routes: {
    getProductDiscount: async (call) => {
      return await discountService.getDiscount(call.request.productPriceInCents, call.request.userId);
      }
  }
});
console.log("Product Discount Grpc Server ON at 0.0.0.0:8081");
server.listen("0.0.0.0:8081");