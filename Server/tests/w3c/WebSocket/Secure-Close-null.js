﻿        var test = async_test("W3C WebSocket API - Create WebSocket - Close the Connection - close(null) - INVALID_ACCESS_ERR is thrown");

        var wsocket = CreateWebSocket(true, false, false);
        var isOpenCalled = false;

        wsocket.addEventListener('open', test.step_func(function (evt) {
            assert_throws("INVALID_ACCESS_ERR", function () { wsocket.close(null) });
            clearTimeout(timeOut);
            test.done();
        }), true);