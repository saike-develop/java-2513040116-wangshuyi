# ☀️ 欢迎来到 Java 暑期学习计划！

> 🎓 本仓库是 **实验室 2026 暑期 Java 学习项目** 的专属模板仓库。
>
> 请严格按照本文档指引操作，确保你的代码能被统一管理和审核。任何违反命名规范或目录结构的仓库将被退回修改。

---

## 🚀 第一步：基于模板创建你的专属仓库（必读）

> ⚠️ **这是整个项目最关键的一步，请务必认真阅读！**

### 操作步骤

1. 点击本仓库页面右上角的绿色按钮 **「Use this template」**
2. 在下拉菜单中选择 **「Create a new repository」**
3. 在创建页面中，按照以下 **三项强制规范** 填写：

---

> 🔴 **强制规范 1：Owner 选择**
>
> **Owner 必须选择实验室的 Organization（组织账号），绝对不能选择个人账号！**
>
> 如果你选择个人账号创建，我们将无法统一管理你的仓库，且无法触发 CI/CD 自动化流程。
> 如果你找不到组织账号，请联系助教添加你到 Organization。

---

> 🔴 **强制规范 2：仓库命名**
>
> **Repository name 必须严格按照以下格式填写：**
>
> ```
> # example
> java-2413043337-huyangyi
> ```
>
> 示例：
> - ✅ `java-2513041216-zhangsan`（张三）
> - ✅ `java-251304xxxx-lisi`（李四）
> - ✅ `java-251304xxxx-wangwu`（王五）
> - ❌ `my-java-project`（不符合规范）
> - ❌ `java-251304xxxx-zhang`（拼音不完整）
> - ❌ `java251304xxxxzhangsan`（缺少连字符）

---

> 🔴 **强制规范 3：可见性设置**
>
> **必须勾选「Public」（公开仓库）！**
>
> 原因如下：
> - 我们的 GitHub Actions 工作流在 Public 仓库下可以 **免费运行**（Private 仓库会消耗付费额度）
> - 公开仓库便于助教统一审核和管理
> - 便于同学之间相互学习和交流
>
> **不要勾选 Private，否则项目流程将无法正常运转！**

---

### ✅ 创建完成后检查清单

| 检查项 | 通过标准                |
|--------|---------------------|
| Owner | 是实验室 Organization   |
| 仓库名 | `java-学号-[姓名全拼]` 格式 |
| 可见性 | Public              |

---

## 📂 第二步：认识你的仓库目录结构

模板仓库已为你预置了规范的目录结构，**请不要随意修改或删除这些目录**：

```
java-template-repo/
├── .idea/          ← 🛠️  IntelliJ IDEA / Android Studio 的项目配置文件
│                      （已加入 .gitignore，不会被提交到 Git）
├── docs/           ← 📚 学习文档与笔记
│                      存放你的学习心得、设计文档、流程图等
├── logs/           ← 📋 运行日志
│                      程序运行产生的日志文件存放于此
├── src/            ← 💻 源代码目录（核心！）
│                      所有 Java 源文件都必须放在这里
│   └── Main.java   ←  示例入口文件（可保留或替换）
├── .gitignore      ←  Git 忽略规则（已配置好，无需手动管理）
└── README.md       ←  项目说明文件（你正在阅读的就是它）
```

### 💡 关于 `src/` 目录的使用建议

> 为了培养良好的工程习惯，建议你按 **周次** 划分包名（Namespace）：
>
> ```
> # 1. 源代码目录
> src/
> ├── basic/           ← 基本内容的练习代码
> │   ├── Exercise01.java
> │   └── Exercise02.java
> ├── medium/           ← 进阶内容的练习代码
> │   ├── Exercise01.java
> │   └── Exercise02.java
> ├── senior/           ← 高级内容的练习代码
> └── ...              ← 以此类推（按照自己的习惯创建调理的目录结构）
> # 2. 学习笔记目录
> docs/
> # 3. 周报目录
> logs/
> ```
>
> 这样做的好处：
> 1. **结构清晰** — 不同部分的内容一目了然
> 2. **方便定位** — 维护者审核时能快速找到对应代码


---

## 🔧 第三步：本地开发与提交流程

### 3.1 Clone 仓库到本地

> 💡 **推荐使用 IDE 克隆仓库**，而非命令行，这样可以避免很多新手常见问题。

**方式一：使用 IntelliJ IDEA（推荐 Java 开发）**

1. 打开 IntelliJ IDEA
2. 选择 **File → New → Project from Version Control**
3. 粘贴你的仓库地址（格式：`https://github.com/组织名/java-2026-[姓名全拼].git`）
4. 点击 **Clone**，等待项目下载完成

**方式二：使用 Android Studio**

1. 打开 Android Studio
2. 选择 **File → New → Project from Version Control → Git**
3. 粘贴你的仓库地址
4. 点击 **Clone**

**方式三：命令行克隆（进阶）**

```bash
git clone https://github.com/组织名/java-2026-[姓名全拼].git
```

### 3.2 日常开发与提交流程

每次完成一个功能或作业后，按照以下流程提交代码：

```bash
# 1. 查看当前修改状态
git status

# 2. 添加修改到暂存区
git add .

# 3. 提交代码（commit message 请简明扼要地描述你做了什么）
git commit -m "feat: 完成第 1 周练习 Exercise01"

# 4. 推送到 GitHub 远程仓库
git push origin main
```

### 3.3 Commit Message 规范

请遵循 **Conventional Commits** 规范，让提交历史清晰可读：

| 前缀 | 适用场景 | 示例 |
|------|---------|------|
| `feat:` | 新增功能/代码 | `feat: 完成第 2 周排序算法实现` |
| `fix:` | 修复 Bug | `fix: 修复数组越界错误` |
| `docs:` | 文档更新 | `docs: 更新学习笔记` |
| `refactor:` | 代码重构 | `refactor: 优化字符串处理逻辑` |
| `chore:` | 杂项维护 | `chore: 清理无用的测试文件` |

---

## 📌 每周任务打卡流程

> 📢 **请密切关注仓库的 Issues 页面，每周任务会以 Issue 的形式发布。**

1. 打开你的仓库 → 点击顶部的 **「Issues」** 标签
2. 找到本周的任务 Issue，仔细阅读需求
3. 完成代码开发并 push 到仓库
4. 在对应的 Issue **下方评论区打卡**，格式参考：
   ```
   ✅ 已完成本周任务
   - 代码已 push 到 main 分支
   - 完成内容：实现了 XXX 功能
   - 遇到的问题：XXX（如有）
   ```
5. 助教会审核你的代码并打分

---

## ❓ 常见问题

<details>
<summary><strong>Q: 我不小心选了个人账号创建仓库，怎么办？</strong></summary>

请联系助教，我们会帮你将仓库迁移到 Organization 下。在此之前请暂停开发。

</details>

<details>
<summary><strong>Q: 我忘记按命名规范命名了，可以改名吗？</strong></summary>

可以在仓库 Settings → Repository name 中修改，但请尽快操作，避免影响后续流程。

</details>

<details>
<summary><strong>Q: 我应该提交 .idea/ 目录下的文件吗？</strong></summary>

不需要。`.idea/` 目录已加入 `.gitignore`，会自动忽略。每个人的 IDE 配置不同，提交这些文件会导致冲突。

</details>

<details>
<summary><strong>Q: 我可以直接在 GitHub 网页上编辑代码吗？</strong></summary>

不推荐。网页编辑功能有限，且容易产生格式问题。请使用本地 IDE 开发后再 push。

</details>

---

## 📞 联系方式

如果在使用过程中遇到任何问题，请通过以下方式联系：

- 在仓库 **Issues** 中提问（推荐）
- 直接联系助教或导师

---

> 🌟 **最后，祝大家在暑期学习中收获满满，写出优雅的 Java 代码！**
>
> —— 来自你的技术导师 🫡
