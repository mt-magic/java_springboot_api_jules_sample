# Spring Boot + Vue.js ユーザー一覧表示アプリケーション

このプロジェクトは、Spring BootバックエンドAPIとVue.jsフロントエンドで構成される、シンプルなフルスタックアプリケーションです。

- **バックエンド**: `/api/users` のREST APIエンドポイントを提供するJava Spring Bootアプリケーションです。
- **フロントエンド**: バックエンドからユーザーデータを取得し、テーブル形式で表示するVue.jsアプリケーションです。
- **開発環境**: VS Codeを使用し、一貫した開発体験を得るための設定済みDev Containerが利用可能です。

## アプリケーションの実行方法

このプロジェクトの実行には、提供されているDev Containerの使用を推奨します。

### 1. Dev Containerで開く
- このプロジェクトをVisual Studio Codeで開きます。
- 右下に表示される「Reopen in Container」のプロンプトをクリックします。これにより、Java、Maven、Node.jsを含む開発環境が構築・起動されます。

### 2. バックエンド (Spring Boot) の起動
- VS Codeで新しいターミナルを開きます (`Ctrl+`` ` または `ターミナル > 新しいターミナル`)。
- 以下のコマンドを実行して、Spring Bootアプリケーションを起動します。
  ```bash
  cd demo
  mvn spring-boot:run
  ```
- バックエンドAPIは `http://localhost:8080/api/users` で利用可能になります。

### 3. フロントエンド (Vue.js) の起動
- VS Codeで2つ目の新しいターミナルを開きます。
- 以下のコマンドを実行して、依存関係をインストールし、Vue.js開発サーバーを起動します。
  ```bash
  cd frontend
  npm install
  npm run dev
  ```

### 4. ユーザー一覧の表示
- フロントエンドアプリケーションには、以下のURLからアクセスできます。ブラウザで開き、ユーザー一覧を確認してください。
- **ユーザー一覧表示URL**: [http://localhost:5173](http://localhost:5173)
