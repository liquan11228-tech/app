from flask import Flask, request, jsonify

app = Flask(__name__)

@app.route('/app/maike/api/index/loginsub', methods=['POST', 'GET'])
def login():
    username = request.values.get('username')
    pwd = request.values.get('pwd')
    # 密码加密方式需与客户端一致，这里直接明文对比123
    if username == '123' and pwd == '202cb962ac59075b964b07152d234b70':  # md5('123')
        return jsonify({"code": "1", "token": "test-token", "message": "登录成功"})
    else:
        return jsonify({"code": "0", "message": "账号或密码错误"})

@app.route('/app/maike/api/index/logingetInfo', methods=['POST', 'GET'])
def get_info():
    token = request.values.get('token')
    if token == 'test-token':
        return jsonify({"code": "1", "message": "获取信息成功", "data": {"username": "123"}})
    else:
        return jsonify({"code": "0", "message": "无效token"})

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=6666)