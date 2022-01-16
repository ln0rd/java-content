package br.com.ln0rd.productapi.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: product_info.proto")
public final class ProductDiscountGrpc {

  private ProductDiscountGrpc() {}

  public static final String SERVICE_NAME = "productDiscount.ProductDiscount";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ProductInfo.ProductDiscountRequest,
      ProductInfo.ProductDiscountResponse> getGetProductDiscountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProductDiscount",
      requestType = ProductInfo.ProductDiscountRequest.class,
      responseType = ProductInfo.ProductDiscountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ProductInfo.ProductDiscountRequest,
      ProductInfo.ProductDiscountResponse> getGetProductDiscountMethod() {
    io.grpc.MethodDescriptor<ProductInfo.ProductDiscountRequest, ProductInfo.ProductDiscountResponse> getGetProductDiscountMethod;
    if ((getGetProductDiscountMethod = ProductDiscountGrpc.getGetProductDiscountMethod) == null) {
      synchronized (ProductDiscountGrpc.class) {
        if ((getGetProductDiscountMethod = ProductDiscountGrpc.getGetProductDiscountMethod) == null) {
          ProductDiscountGrpc.getGetProductDiscountMethod = getGetProductDiscountMethod =
              io.grpc.MethodDescriptor.<ProductInfo.ProductDiscountRequest, ProductInfo.ProductDiscountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProductDiscount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductInfo.ProductDiscountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductInfo.ProductDiscountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductDiscountMethodDescriptorSupplier("getProductDiscount"))
              .build();
        }
      }
    }
    return getGetProductDiscountMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductDiscountStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductDiscountStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductDiscountStub>() {
        @java.lang.Override
        public ProductDiscountStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductDiscountStub(channel, callOptions);
        }
      };
    return ProductDiscountStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductDiscountBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductDiscountBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductDiscountBlockingStub>() {
        @java.lang.Override
        public ProductDiscountBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductDiscountBlockingStub(channel, callOptions);
        }
      };
    return ProductDiscountBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductDiscountFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductDiscountFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductDiscountFutureStub>() {
        @java.lang.Override
        public ProductDiscountFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductDiscountFutureStub(channel, callOptions);
        }
      };
    return ProductDiscountFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ProductDiscountImplBase implements io.grpc.BindableService {

    /**
     */
    public void getProductDiscount(ProductInfo.ProductDiscountRequest request,
                                   io.grpc.stub.StreamObserver<ProductInfo.ProductDiscountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProductDiscountMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetProductDiscountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ProductInfo.ProductDiscountRequest,
                ProductInfo.ProductDiscountResponse>(
                  this, METHODID_GET_PRODUCT_DISCOUNT)))
          .build();
    }
  }

  /**
   */
  public static final class ProductDiscountStub extends io.grpc.stub.AbstractAsyncStub<ProductDiscountStub> {
    private ProductDiscountStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductDiscountStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductDiscountStub(channel, callOptions);
    }

    /**
     */
    public void getProductDiscount(ProductInfo.ProductDiscountRequest request,
                                   io.grpc.stub.StreamObserver<ProductInfo.ProductDiscountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProductDiscountMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductDiscountBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProductDiscountBlockingStub> {
    private ProductDiscountBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductDiscountBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductDiscountBlockingStub(channel, callOptions);
    }

    /**
     */
    public ProductInfo.ProductDiscountResponse getProductDiscount(ProductInfo.ProductDiscountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProductDiscountMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductDiscountFutureStub extends io.grpc.stub.AbstractFutureStub<ProductDiscountFutureStub> {
    private ProductDiscountFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductDiscountFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductDiscountFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ProductInfo.ProductDiscountResponse> getProductDiscount(
        ProductInfo.ProductDiscountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProductDiscountMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PRODUCT_DISCOUNT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductDiscountImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductDiscountImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PRODUCT_DISCOUNT:
          serviceImpl.getProductDiscount((ProductInfo.ProductDiscountRequest) request,
              (io.grpc.stub.StreamObserver<ProductInfo.ProductDiscountResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ProductDiscountBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductDiscountBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ProductInfo.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductDiscount");
    }
  }

  private static final class ProductDiscountFileDescriptorSupplier
      extends ProductDiscountBaseDescriptorSupplier {
    ProductDiscountFileDescriptorSupplier() {}
  }

  private static final class ProductDiscountMethodDescriptorSupplier
      extends ProductDiscountBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductDiscountMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProductDiscountGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductDiscountFileDescriptorSupplier())
              .addMethod(getGetProductDiscountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
